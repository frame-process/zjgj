package com.zjgj.cas.common.resolver;

/**
 * Created by liuguangsheng on 2016/8/18.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apereo.cas.authentication.AuthenticationHandler;
import org.apereo.cas.authentication.Credential;
import org.apereo.cas.authentication.principal.Principal;
import org.apereo.cas.authentication.principal.PrincipalResolver;
import org.apereo.cas.authentication.principal.SimplePrincipal;
import org.apereo.services.persondir.IPersonAttributeDao;
import org.apereo.services.persondir.IPersonAttributes;
import org.apereo.services.persondir.support.StubPersonAttributeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zjgj.cas.common.util.EncryptTool;

public class PersonPrincipalResolver implements PrincipalResolver {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private boolean returnNullIfNoAttributes = false;
    private IPersonAttributeDao attributeRepository = new StubPersonAttributeDao(new HashMap());
    private String principalAttributeName;

    public PersonPrincipalResolver() {
    }

    public Principal resolve(Credential credential) {
        this.logger.debug("Attempting to resolve a principal...");
        String principalId = this.extractPrincipalId(credential);
        if (principalId == null) {
            this.logger.debug("Got null for extracted principal ID; returning null.");
            return null;
        } else {
            this.logger.debug("Creating SimplePrincipal for [{}]", principalId);
            IPersonAttributes personAttributes = this.attributeRepository.getPerson(principalId);
            Map attributes;
            if (personAttributes == null) {
                attributes = null;
            } else {
                attributes = personAttributes.getAttributes();
            }

            if (attributes == null & !this.returnNullIfNoAttributes) {
                return new SimplePrincipal(principalId);
            } else if (attributes == null) {
                return null;
            } else {
                HashMap convertedAttributes = new HashMap();
                Iterator i$ = attributes.keySet().iterator();

                String str;
                List username;
                while (i$.hasNext()) {
                    str = (String) i$.next();
                    username = (List) attributes.get(str);
                    if (str.equalsIgnoreCase(this.principalAttributeName)) {
                        if (username.isEmpty()) {
                            this.logger.debug("{} is empty, using {} for principal", this.principalAttributeName, principalId);
                        } else {
                            principalId = username.get(0).toString();
                            this.logger.debug("Found principal attribute value {}; removing {} from attribute map.", principalId, this.principalAttributeName);
                        }
                    } else {
                        convertedAttributes.put(str, username.size() == 1 ? username.get(0) : username);
                    }
                }

                str = "{\"username\":\"%s\",\"scheme\":\"%s\",\"ts\":%s,\"userId\":\"%s\"}";
                username = (List) attributes.get("userName");
                List userid = (List) attributes.get("userId");
                String json = String.format(str, new Object[]{username.get(0), "mysql", Long.valueOf(System.currentTimeMillis()), userid.get(0)});

                try {
                    EncryptTool e = new EncryptTool();
                    convertedAttributes.put("token", e.encrypt(json));
                } catch (Exception var12) {
                    var12.printStackTrace();
                }

                return new SimplePrincipal(principalId, convertedAttributes);
            }
        }
    }

    public boolean supports(Credential credential) {
        return true;
    }

    public IPersonAttributeDao getAttributeRepository() {
        return this.attributeRepository;
    }

    public void setAttributeRepository(IPersonAttributeDao attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    protected String extractPrincipalId(Credential credential) {
        return credential.getId();
    }

    public String getPrincipalAttributeName() {
        return this.principalAttributeName;
    }

    public void setPrincipalAttributeName(String principalAttributeName) {
        this.principalAttributeName = principalAttributeName;
    }

	@Override
	public Principal resolve(Credential credential, Principal principal, AuthenticationHandler handler) {
		return resolve(credential);
	}
}
package com.zjgj.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;

public class CrmGeneratorClass {
	public static void main(String[]args)throws Exception{
		String templatePath = "D:\\eclipse-workspace\\zjgj\\zjgj-generator\\template-crm";
        GeneratorFacade g = new GeneratorFacade();
        g.deleteOutRootDir();
        g.getGenerator().addTemplateRootDir(templatePath);
        g.generateByTable("cas_dept");
        g.generateByTable("cas_resource");
        g.generateByTable("cas_role");
        g.generateByTable("cas_role_resource");
        g.generateByTable("cas_user");
        g.generateByTable("cas_user_resource");
        g.generateByTable("cas_user_role");
        g.generateByTable("cas_wx_user");
        g.generateByTable("crm_car");
        g.generateByTable("crm_car_change");
        g.generateByTable("crm_city");
        g.generateByTable("crm_claim_car");
        g.generateByTable("crm_claim_policy");
        g.generateByTable("crm_claim_trck");
        g.generateByTable("crm_claim_trck_change");
        g.generateByTable("crm_customer");
        g.generateByTable("crm_customer_change");
        g.generateByTable("crm_dict");
        g.generateByTable("crm_gift");
        g.generateByTable("crm_gift_group");
        g.generateByTable("crm_holiday");
        g.generateByTable("crm_insurance");
        g.generateByTable("crm_opt_log");
        g.generateByTable("crm_repair_shop");
        g.generateByTable("crm_sell_car");
        g.generateByTable("crm_sell_insurance");
        g.generateByTable("crm_sell_policy");
        g.generateByTable("crm_sell_trck");
        g.generateByTable("crm_sell_trck_change");
        g.generateByTable("crm_sms_log");
        g.generateByTable("crm_upload_file");
        g.generateByTable("wx_user");
    }
}

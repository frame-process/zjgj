重定向
location / {
        rewrite ^/(.*)$ https://m.jd.id/tiket-pesawat/$1 permanent;
}


#############################
upstream tomcat_m-flight.jd.id {
    server 127.0.0.1:1601  weight=10 max_fails=2 fail_timeout=30s ;
}

server {
    listen          80;
    server_name     m-flight.jd.id;
    log_format mylog  '$http_j_forwarded_for | $http_x_forwarded_for | $remote_addr - $remote_user [$time_local] '
                                             '"$request" $status $bytes_sent '
                                             '"$http_referer" "$http_user_agent" '
                                             '"$gzip_ratio"';
    access_log      /export/servers/nginx/logs/m-flight.jd.id/m-flight.jd.id_access.log mylog;
    error_log       /export/servers/nginx/logs/m-flight.jd.id/m-flight.jd.id_error.log warn;

    chunkin on;

    error_page 411 = @my_error;

    location @my_error {
        chunkin_resume;
    }
    root /export/Packages/virtual-id-flight-h5/latest/;
    
    location / {
        rewrite ^/(.*)$ https://m.jd.id/tiket-pesawat/$1 permanent;
    }
    
    location /tiket-pesawat/api/ {
        proxy_next_upstream     http_500 http_502 http_503 http_504 error timeout invalid_header;
        proxy_set_header        Host  $host;
        proxy_set_header        X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_pass              http://tomcat_m-flight.jd.id/api/;
        expires                 0;
    }

    location /logs/ {
        autoindex       off;
        deny all;
    }
}

server {
    listen          80;
    server_name     flight.m.id.jd.local;
    access_log      /export/servers/nginx/logs/m-flight.jd.id/m-flight.jd.id_access.log main;
    error_log       /export/servers/nginx/logs/m-flight.jd.id/m-flight.jd.id_error.log warn;

    chunkin on;

    error_page 411 = @my_error;

    location @my_error {
        chunkin_resume;
    }
    root /export/Packages/virtual-id-flight-h5/latest/;
    
    location /tiket-pesawat/ {
        proxy_next_upstream     http_500 http_502 http_503 http_504 error timeout invalid_header;
        proxy_set_header        Host  $host;
        proxy_set_header        X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_pass              http://tomcat_m-flight.jd.id/;
        expires                 0;
    }

    location /logs/ {
        autoindex       off;
        deny all;
    }
}
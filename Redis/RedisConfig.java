package com.example.demo.Redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "redis")
@PropertySource("classpath:application.properties")
public class RedisConfig {
    String port;
    String host;
    String timeout;
    String password;
    String pool_max_wait;
    String pool_max_active;
    String pool_max_idle;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPool_max_wait() {
        return pool_max_wait;
    }

    public void setPool_max_wait(String pool_max_wait) {
        this.pool_max_wait = pool_max_wait;
    }

    public String getPool_max_active() {
        return pool_max_active;
    }

    public void setPool_max_active(String pool_max_active) {
        this.pool_max_active = pool_max_active;
    }

    public String getPool_max_idle() {
        return pool_max_idle;
    }

    public void setPool_max_idle(String pool_max_idle) {
        this.pool_max_idle = pool_max_idle;
    }

    public RedisConfig() {
    }

    public RedisConfig(String port, String host, String timeout, String password, String pool_max_wait, String pool_max_active, String pool_max_idle) {
        this.port = port;
        this.host = host;
        this.timeout = timeout;
        this.password = password;
        this.pool_max_wait = pool_max_wait;
        this.pool_max_active = pool_max_active;
        this.pool_max_idle = pool_max_idle;
    }
}

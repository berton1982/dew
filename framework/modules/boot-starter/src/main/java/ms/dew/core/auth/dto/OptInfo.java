/*
 * Copyright 2020. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ms.dew.core.auth.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Set;

/**
 * 操作用户信息.
 *
 * @param <E> 扩展操作用户信息类型
 * @author gudaoxuri
 */
@ApiModel(value = "操作用户信息")
public class OptInfo<E> {

    /**
     * The constant DEFAULT_TOKEN_KIND_FLAG.
     */
    public static final String DEFAULT_TOKEN_KIND_FLAG = "DEFAULT";

    /**
     * The Token.
     */
    @ApiModelProperty(value = "Token", required = true)
    protected String token;
    /**
     * The Account code.
     */
    @ApiModelProperty(value = "账号编码", required = true)
    protected Object accountCode;
    /**
     * The Token kind.
     */
    @ApiModelProperty(value = "Token类型")
    protected String tokenKind = DEFAULT_TOKEN_KIND_FLAG;

    /**
     * The Roles.
     */
    @ApiModelProperty(value = "角色列表", required = true)
    protected Set<RoleInfo> roleInfo;


    /**
     * Role info.
     */
    @ApiModel(value = "角色信息")
    public static class RoleInfo {
        @ApiModelProperty(value = "角色编码", required = true)
        private String code;
        @ApiModelProperty(value = "角色显示名称", required = true)
        private String name;
        @ApiModelProperty(value = "租户编码", required = true)
        private String tenantCode;

        /**
         * Gets code.
         *
         * @return the code
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets code.
         *
         * @param code the code
         * @return the code
         */
        public RoleInfo setCode(String code) {
            this.code = code;
            return this;
        }

        /**
         * Gets name.
         *
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Sets name.
         *
         * @param name the name
         * @return the name
         */
        public RoleInfo setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Gets tenant code.
         *
         * @return the tenant code
         */
        public String getTenantCode() {
            return tenantCode;
        }

        /**
         * Sets tenant code.
         *
         * @param tenantCode the tenant code
         * @return the tenant code
         */
        public RoleInfo setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
    }

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     *
     * @param token the token
     * @return the token
     */
    public E setToken(String token) {
        this.token = token;
        return (E) this;
    }

    /**
     * Gets account code.
     *
     * @return the account code
     */
    public Object getAccountCode() {
        return accountCode;
    }

    /**
     * Sets account code.
     *
     * @param accountCode the account code
     * @return the account code
     */
    public E setAccountCode(Object accountCode) {
        this.accountCode = accountCode;
        return (E) this;
    }

    /**
     * Gets token kind.
     *
     * @return the token kind
     */
    public String getTokenKind() {
        return tokenKind;
    }

    /**
     * Sets token kind.
     *
     * @param tokenKind the token kind
     * @return the token kind
     */
    public E setTokenKind(String tokenKind) {
        this.tokenKind = tokenKind;
        return (E) this;
    }

    /**
     * Gets role info.
     *
     * @return the role info
     */
    public Set<RoleInfo> getRoleInfo() {
        return roleInfo;
    }

    /**
     * Sets role info.
     *
     * @param roleInfo the role info
     * @return the role info
     */
    public E setRoleInfo(Set<RoleInfo> roleInfo) {
        this.roleInfo = roleInfo;
        return (E)this;
    }
}

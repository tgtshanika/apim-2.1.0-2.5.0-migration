/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package migration.service.v550;

public class SQLConstants {

    public static final String RETRIEVE_ACCESS_TOKEN_TABLE_MYSQL =
            "SELECT ACCESS_TOKEN_HASH, REFRESH_TOKEN_HASH FROM " + "IDN_OAUTH2_ACCESS_TOKEN LIMIT 1";

    public static final String RETRIEVE_ACCESS_TOKEN_TABLE_DB2SQL =
            "SELECT ACCESS_TOKEN_HASH, REFRESH_TOKEN_HASH FROM " + "IDN_OAUTH2_ACCESS_TOKEN FETCH FIRST 1 ROWS ONLY";

    public static final String RETRIEVE_ACCESS_TOKEN_TABLE_MSSQL =
            "SELECT TOP 1 ACCESS_TOKEN_HASH, REFRESH_TOKEN_HASH FROM " + "IDN_OAUTH2_ACCESS_TOKEN";

    public static final String RETRIEVE_ACCESS_TOKEN_TABLE_INFORMIX =
            "SELECT FIRST 1 ACCESS_TOKEN_HASH, REFRESH_TOKEN_HASH FROM " + "IDN_OAUTH2_ACCESS_TOKEN";

    public static final String RETRIEVE_ACCESS_TOKEN_TABLE_ORACLE =
            "SELECT ACCESS_TOKEN_HASH, REFRESH_TOKEN_HASH FROM " + "IDN_OAUTH2_ACCESS_TOKEN WHERE ROWNUM < 2";

    public static final String RETRIEVE_AUTHORIZATION_CODE_TABLE_MYSQL =
            "SELECT AUTHORIZATION_CODE_HASH FROM " + "IDN_OAUTH2_AUTHORIZATION_CODE LIMIT 1";

    public static final String RETRIEVE_AUTHORIZATION_CODE_TABLE_DB2SQL =
            "SELECT AUTHORIZATION_CODE_HASH FROM " + "IDN_OAUTH2_AUTHORIZATION_CODE FETCH FIRST 1 ROWS ONLY";

    public static final String RETRIEVE_AUTHORIZATION_CODE_TABLE_MSSQL =
            "SELECT TOP 1 AUTHORIZATION_CODE_HASH FROM " + "IDN_OAUTH2_AUTHORIZATION_CODE";

    public static final String RETRIEVE_AUTHORIZATION_CODE_TABLE_INFORMIX =
            "SELECT FIRST 1 AUTHORIZATION_CODE_HASH FROM " + "IDN_OAUTH2_AUTHORIZATION_CODE";

    public static final String RETRIEVE_AUTHORIZATION_CODE_TABLE_ORACLE =
            "SELECT AUTHORIZATION_CODE_HASH FROM " + "IDN_OAUTH2_AUTHORIZATION_CODE WHERE ROWNUM < 2";

    public static final String ADD_ACCESS_TOKEN_HASH_COLUMN =
            "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ADD ACCESS_TOKEN_HASH VARCHAR(512)";

    public static final String ADD_REFRESH_TOKEN_HASH_COLUMN =
            "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ADD REFRESH_TOKEN_HASH VARCHAR(512)";

    public static final String ADD_AUTHORIZATION_CODE_HASH_COLUMN =
            "ALTER TABLE IDN_OAUTH2_AUTHORIZATION_CODE ADD AUTHORIZATION_CODE_HASH VARCHAR(512)";

    public static final String RETRIEVE_CONSUMER_APPS_TABLE_MYSQL =
            "SELECT CONSUMER_SECRET_HASH FROM " + "IDN_OAUTH_CONSUMER_APPS LIMIT 1";

    public static final String RETRIEVE_CONSUMER_APPS_TABLE_DB2SQL =
            "SELECT CONSUMER_SECRET_HASH FROM" + " " + "IDN_OAUTH_CONSUMER_APPS FETCH FIRST 1 ROWS ONLY";

    public static final String RETRIEVE_CONSUMER_APPS_TABLE_MSSQL =
            "SELECT TOP 1 CONSUMER_SECRET_HASH FROM " + "IDN_OAUTH_CONSUMER_APPS";

    public static final String RETRIEVE_CONSUMER_APPS_TABLE_INFORMIX =
            "SELECT FIRST 1 CONSUMER_SECRET_HASH FROM " + "IDN_OAUTH_CONSUMER_APPS";

    public static final String RETRIEVE_CONSUMER_APPS_TABLE_ORACLE =
            "SELECT CONSUMER_SECRET_HASH FROM " + "IDN_OAUTH_CONSUMER_APPS WHERE ROWNUM < 2";

    public static final String DELETE_CONSUMER_SECRET_HASH_COLUMN = "ALTER TABLE IDN_OAUTH_CONSUMER_APPS DROP COLUMN "
            + "CONSUMER_SECRET_HASH";

    public static final String RETRIEVE_ALL_TOKENS = "SELECT ACCESS_TOKEN, REFRESH_TOKEN, TOKEN_ID FROM " +
            "IDN_OAUTH2_ACCESS_TOKEN";

    public static final String UPDATE_ACCESS_TOKEN = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET " +
            "ACCESS_TOKEN_HASH=?, REFRESH_TOKEN_HASH=? WHERE " +
            "TOKEN_ID=?";

    public static final String RETRIEVE_ALL_AUTHORIZATION_CODES = "SELECT AUTHORIZATION_CODE, CODE_ID FROM " +
            "IDN_OAUTH2_AUTHORIZATION_CODE";

    public static final String UPDATE_AUTHORIZATION_CODE =
            "UPDATE IDN_OAUTH2_AUTHORIZATION_CODE SET " + "AUTHORIZATION_CODE_HASH=? WHERE "
                    + "CODE_ID=?";

    public static final String RETRIEVE_ALL_CONSUMER_SECRETS =
            "SELECT CONSUMER_SECRET, ID FROM " + "IDN_OAUTH_CONSUMER_APPS";

    public static final String UPDATE_CONSUMER_SECRET =
            "UPDATE IDN_OAUTH_CONSUMER_APPS SET " + "CONSUMER_SECRET=? WHERE " + "ID=?";

    public static final String RETRIEVE_ALL_BPS_PROFILES =
            "SELECT PASSWORD, PROFILE_NAME, TENANT_ID FROM " + "WF_BPS_PROFILE";

    public static final String UPDATE_BPS_PROFILE_PASSWORD =
            "UPDATE WF_BPS_PROFILE SET " + "PASSWORD=? WHERE " + "PROFILE_NAME=? AND TENANT_ID=?";

}

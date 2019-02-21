package com.word.common;

public class Const {

    public static  final  String CURRENT_USER = "currentUser";
    public static final  String EMAIL = "email";
    public static  final  String USERNAME = "username";
    public interface  Role{
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1; //管理员
    }

    public enum  ProductStatusEnum{
        ON_STATUS(1,"在线");
        private String value;
        private int code;
        ProductStatusEnum(int code,String value){
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}

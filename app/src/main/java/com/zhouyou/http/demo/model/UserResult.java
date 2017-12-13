package com.zhouyou.http.demo.model;

/**
 * Description:
 * Date：2017/12/13 17:11
 * Author: wangyong
 */

public class UserResult {

    /**
     * patientUser : {"id":226,"password":"mingyizaixian123456789","loginId":"patient_15521377484","phone":"15521377484","name":"测试1555","sex":"","birthday":null,"headUrl":"","location":null,"occupation":null,"visitState":"","hospital":"","remarks":"","createtime":1502183718000,"updatetime":null,"easemobUuid":"8bffcac0-7c1a-11e7-b53e-5f6f038e8554","source":null,"identification":null,"bpDeviceid":null,"bsDeviceid":null,"medicalCard":""}
     */

    private PatientUserEntity patientUser;

    public void setPatientUser(PatientUserEntity patientUser) {
        this.patientUser = patientUser;
    }

    public PatientUserEntity getPatientUser() {
        return patientUser;
    }

    public static class PatientUserEntity {
        /**
         * id : 226
         * password : mingyizaixian123456789
         * loginId : patient_15521377484
         * phone : 15521377484
         * name : 测试1555
         * sex :
         * birthday : null
         * headUrl :
         * location : null
         * occupation : null
         * visitState :
         * hospital :
         * remarks :
         * createtime : 1502183718000
         * updatetime : null
         * easemobUuid : 8bffcac0-7c1a-11e7-b53e-5f6f038e8554
         * source : null
         * identification : null
         * bpDeviceid : null
         * bsDeviceid : null
         * medicalCard :
         */

        private int id;
        private String password;
        private String loginId;
        private String phone;
        private String name;
        private String sex;
        private Object birthday;
        private String headUrl;
        private Object location;
        private Object occupation;
        private String visitState;
        private String hospital;
        private String remarks;
        private long createtime;
        private Object updatetime;
        private String easemobUuid;
        private Object source;
        private Object identification;
        private Object bpDeviceid;
        private Object bsDeviceid;
        private String medicalCard;

        public void setId(int id) {
            this.id = id;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setLoginId(String loginId) {
            this.loginId = loginId;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public void setHeadUrl(String headUrl) {
            this.headUrl = headUrl;
        }

        public void setLocation(Object location) {
            this.location = location;
        }

        public void setOccupation(Object occupation) {
            this.occupation = occupation;
        }

        public void setVisitState(String visitState) {
            this.visitState = visitState;
        }

        public void setHospital(String hospital) {
            this.hospital = hospital;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public void setCreatetime(long createtime) {
            this.createtime = createtime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public void setEasemobUuid(String easemobUuid) {
            this.easemobUuid = easemobUuid;
        }

        public void setSource(Object source) {
            this.source = source;
        }

        public void setIdentification(Object identification) {
            this.identification = identification;
        }

        public void setBpDeviceid(Object bpDeviceid) {
            this.bpDeviceid = bpDeviceid;
        }

        public void setBsDeviceid(Object bsDeviceid) {
            this.bsDeviceid = bsDeviceid;
        }

        public void setMedicalCard(String medicalCard) {
            this.medicalCard = medicalCard;
        }

        public int getId() {
            return id;
        }

        public String getPassword() {
            return password;
        }

        public String getLoginId() {
            return loginId;
        }

        public String getPhone() {
            return phone;
        }

        public String getName() {
            return name;
        }

        public String getSex() {
            return sex;
        }

        public Object getBirthday() {
            return birthday;
        }

        public String getHeadUrl() {
            return headUrl;
        }

        public Object getLocation() {
            return location;
        }

        public Object getOccupation() {
            return occupation;
        }

        public String getVisitState() {
            return visitState;
        }

        public String getHospital() {
            return hospital;
        }

        public String getRemarks() {
            return remarks;
        }

        public long getCreatetime() {
            return createtime;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public String getEasemobUuid() {
            return easemobUuid;
        }

        public Object getSource() {
            return source;
        }

        public Object getIdentification() {
            return identification;
        }

        public Object getBpDeviceid() {
            return bpDeviceid;
        }

        public Object getBsDeviceid() {
            return bsDeviceid;
        }

        public String getMedicalCard() {
            return medicalCard;
        }
    }
}

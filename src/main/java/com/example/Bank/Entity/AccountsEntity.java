package com.example.Bank.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class AccountsEntity {
	   @Id
	   @GeneratedValue(strategy= GenerationType.AUTO)
	    private Long account_no;
	    private String first_name;
	    private String second_name;
	    private String last_name;
	    private String dob;
	    private String pin_code;
	    private String city;
	    private String post;
	    private String full_address;
	    private String email_id;
	    private String phone;
	    private String alternate_phone;
	    private String aadhar_no;
	    private String pan_no;
	    private String father_name;


	    public AccountsEntity(Long account_no, String first_name, String second_name, String last_name, String dob,
	                          String pin_code, String city, String post, String full_address, String email_id, String phone,
	                          String alternate_phone, String aadhar_no, String pan_no, String father_name) {
	        super();
	        this.account_no = account_no;
	        this.first_name = first_name;
	        this.second_name = second_name;
	        this.last_name = last_name;
	        this.dob = dob;
	        this.pin_code = pin_code;
	        this.city = city;
	        this.post = post;
	        this.full_address = full_address;
	        this.email_id = email_id;
	        this.phone = phone;
	        this.alternate_phone = alternate_phone;
	        this.aadhar_no = aadhar_no;
	        this.pan_no = pan_no;
	        this.father_name = father_name;
	    }


	    public Long getAccount_no() {
	        return account_no;
	    }


	    public void setAccount_no(Long account_no) {
	        this.account_no = account_no;
	    }


	    public String getFirst_name() {
	        return first_name;
	    }


	    public void setFirst_name(String first_name) {
	        this.first_name = first_name;
	    }


	    public String getSecond_name() {
	        return second_name;
	    }


	    public void setSecond_name(String second_name) {
	        this.second_name = second_name;
	    }


	    public String getLast_name() {
	        return last_name;
	    }


	    public void setLast_name(String last_name) {
	        this.last_name = last_name;
	    }


	    public String getDob() {
	        return dob;
	    }


	    public void setDob(String dob) {
	        this.dob = dob;
	    }


	    public String getPin_code() {
	        return pin_code;
	    }


	    public void setPin_code(String pin_code) {
	        this.pin_code = pin_code;
	    }


	    public String getCity() {
	        return city;
	    }


	    public void setCity(String city) {
	        this.city = city;
	    }


	    public String getPost() {
	        return post;
	    }


	    public void setPost(String post) {
	        this.post = post;
	    }


	    public String getFull_address() {
	        return full_address;
	    }


	    public void setFull_address(String full_address) {
	        this.full_address = full_address;
	    }


	    public String getEmail_id() {
	        return email_id;
	    }


	    public void setEmail_id(String email_id) {
	        this.email_id = email_id;
	    }


	    public String getPhone() {
	        return phone;
	    }


	    public void setPhone(String phone) {
	        this.phone = phone;
	    }


	    public String getAlternate_phone() {
	        return alternate_phone;
	    }


	    public void setAlternate_phone(String alternate_phone) {
	        this.alternate_phone = alternate_phone;
	    }


	    public String getAadhar_no() {
	        return aadhar_no;
	    }


	    public void setAadhar_no(String aadhar_no) {
	        this.aadhar_no = aadhar_no;
	    }


	    public String getPan_no() {
	        return pan_no;
	    }


	    public void setPan_no(String pan_no) {
	        this.pan_no = pan_no;
	    }


	    public String getFather_name() {
	        return father_name;
	    }


	    public void setFather_name(String father_name) {
	        this.father_name = father_name;
	    }


	    public AccountsEntity() {
	        super();
	        // TODO Auto-generated constructor stub
	    }


	    @Override
	    public String toString() {
	        return "AccountsEntity [account_no=" + account_no + ", first_name=" + first_name + ", second_name="
	                + second_name + ", last_name=" + last_name + ", dob=" + dob + ", pin_code=" + pin_code + ", city="
	                + city + ", post=" + post + ", full_address=" + full_address + ", email_id=" + email_id + ", phone="
	                + phone + ", alternate_phone=" + alternate_phone + ", aadhar_no=" + aadhar_no + ", pan_no=" + pan_no
	                + ", father_name=" + father_name + "]";
	    }


}

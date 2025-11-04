/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliu
 */
class User {

    String username, role, email, name, mobile, address, dob;

    User(String username, String role, String email, String name, String mobile, String address, String dob) {
        this.username = username;
        this.role = role;
        this.email = email;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.dob = dob;
    }

    User(String john, String paracetamol, int i) throws SupportedOperationException {
        throw new SupportedOperationException("Not supported yet.");
    }
}

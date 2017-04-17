package Entities;

import javax.persistence.*;

/**
 * Created by linhtran on 12/04/2017.
 */
@Embeddable
public class Phone {

//    @Column(name = "owner_id", nullable = false)
//    private int ownerId;
    @Column(name = "type")
    private String type;
    @Column(name = "area_code")
    private String areaCode;
    @Column(name = "number")
    private String number;

    //@Column(name = "phone_order")
    private int phoneOrder;


    public Phone() {
    }

    public Phone(String type, String areaCode, String number,int phoneOrder) {
        this.type = type;
        this.areaCode = areaCode;
        this.number = number;
        this.phoneOrder=phoneOrder;
    }

//    public int getOwnerId() {
//        return ownerId;
//    }
//
//    public void setOwnerId(int ownerId) {
//        this.ownerId = ownerId;
//    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPhoneOrder() {
        return phoneOrder;
    }

    public void setPhoneOrder(int phoneOrder) {
        this.phoneOrder = phoneOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

//        if (ownerId != phone.ownerId) return false;
        if (type != null ? !type.equals(phone.type) : phone.type != null) return false;
        if (areaCode != null ? !areaCode.equals(phone.areaCode) : phone.areaCode != null) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;

        return true;
    }
}

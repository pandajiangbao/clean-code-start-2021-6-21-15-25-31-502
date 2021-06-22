package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private Address toAddress;
    private Address fromAddress;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.setToAddress(toAddress);
        this.setFromAddress(fromAddress);
    }

    public DeliverCenter allocate() {
        if (toAddress.getProvince().equals(fromAddress.getProvince()) && toAddress.getCity().equals(fromAddress.getCity())) {
            return DeliverCenter.LOCAL;
        }
        if (toAddress.getProvince().equals(fromAddress.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }



    public void setToAddress(String toAddress) {
        this.toAddress = new Address(toAddress);
//        this.toAddress = toAddress;
    }


    public void setFromAddress(String fromAddress) {
        this.fromAddress = new Address(fromAddress);
//        this.fromAddress = fromAddress;
    }
}

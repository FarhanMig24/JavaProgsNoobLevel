package com.company;

public class CBRef {
    int val;
    static void byRef(CBRef aObj)
    {
        aObj.val=12;
        System.out.println(aObj.val);
    }

    public static void main(String[] args) {
        CBRef oObj= new CBRef();
        oObj.val=9;
        System.out.println(oObj.val);
        byRef(oObj);
        System.out.println(oObj.val);
    }
}

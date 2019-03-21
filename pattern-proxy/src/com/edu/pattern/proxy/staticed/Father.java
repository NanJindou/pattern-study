package com.edu.pattern.proxy.staticed;

public class Father {

    private Person person;

    public Father(Person person){
        this.person=person;
    }

    public void findLove(){
        this.person.findLove();
        System.out.println("根据要求物色");
        System.out.println("双方父母是否同意");
    }

    public void food(){
        this.person.food();
        System.out.println("根据要求觅食");
        System.out.println("看钱够不够的");
    }
}


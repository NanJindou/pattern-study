package com.edu.pattern.prototype.deep;

public class Test {

    public static void main(String[] args) {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            //QiTianDaSheng obj = (QiTianDaSheng)qiTianDaSheng.clone();
            QiTianDaSheng obj = (QiTianDaSheng)qiTianDaSheng.deepClone();
            System.out.println(qiTianDaSheng.jinGuBang==obj.jinGuBang );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

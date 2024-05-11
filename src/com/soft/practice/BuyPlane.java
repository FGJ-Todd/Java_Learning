//package com.soft.practice;
//
//public class BuyPlane {
//    public static boolean season(int month){
//        switch (month){
//            case 5,6,7,8,9,10:
//                return true;
//            default:
//                return false;
//        }
//    }
//    public static double planeTicket(int a, int month, String type){
//        boolean flag = season(month);
//        if (flag){
//            if (type.equals("头等舱")){
//                return a * 0.9;
//            }else if (type.equals("经济舱")){
//                return a * 0.85;
//            }
//        }else{
//            if (type.equals("头等舱")){
//                return a * 0.7;
//            }else if (type.equals("经济舱")){
//                return a * 0.65;
//            }
//        }
//        return 1;
//    }
//
//}

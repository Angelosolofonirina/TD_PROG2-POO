package com.travdir;


class OrderItemTest {
    public static void main(String[] args) {
            OrderItem one = new OrderItem(2,"Haricot vert",3,200_000);
            OrderItem two = new OrderItem(3,"Voanjobory",4,25_000_000);
            one.getTotal();
            two.getTotal();

}};
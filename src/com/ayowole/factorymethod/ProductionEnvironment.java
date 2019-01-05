package com.ayowole.factorymethod;

class ProductionEnvironment implements Environment {

    @Override
    public void task() {
        System.out.println("this is an production environment");
        
    }

}

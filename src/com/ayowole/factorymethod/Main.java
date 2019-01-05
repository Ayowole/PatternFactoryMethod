package com.ayowole.factorymethod;

class Main {
    
    public static void main(String[] args) {
        Environment selectedEnvironment = new EnvironmentFactory()
                .getEnvironment(EnvironmentEnum.PRODUCTION);
        
        Environment selectedEnvironment2 = new EnvironmentFactory()
                .getEnvironment(EnvironmentEnum.TEST);
        
        selectedEnvironment.task();
        selectedEnvironment2.task();
    }
    
}

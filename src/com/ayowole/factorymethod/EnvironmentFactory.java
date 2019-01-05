package com.ayowole.factorymethod;

class EnvironmentFactory {

    public Environment getEnvironment(EnvironmentEnum environment) {
        if (environment.equals(EnvironmentEnum.TEST)) return new TestEnvironment();
        
        else if (environment.equals(EnvironmentEnum.PRODUCTION)) return new ProductionEnvironment();
        
        else throw new RuntimeException("the environment request can't be chosen");
    }

}

package org.example.tp_ioc;


import org.springframework.stereotype.Component;


@Component("dataImplExt")
public class DataImplExt implements IData{
    @Override
    public double getData() {
        return 5*10;
    }
}

package org.example.tp_ioc;


import org.springframework.stereotype.Component;


@Component("dataImpl")
public class DataImpl implements IData{
    @Override
    public double getData() {
        return 5*2;
    }
}

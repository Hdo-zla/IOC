package org.example.tp_ioc;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{

    private IData data;

    @Autowired
    public MetierImpl(@Qualifier("dataImplExt") IData data) {
        this.data = data;
    }

    @Override
    public double calcul() {
            return data.getData();
    }
}

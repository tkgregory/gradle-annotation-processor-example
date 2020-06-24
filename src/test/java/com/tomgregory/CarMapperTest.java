package com.tomgregory;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CarMapperTest {

    @Test
    public void mapsCar() {
        CarEntity lamborghini = new CarEntity("Lamborghini", 2);

        CarMapper mapper = Mappers.getMapper( CarMapper.class );
        CarDto carDto = mapper.carToCarDto(lamborghini);

        assertThat(carDto.getMake(), is("Lamborghini"));
        assertThat(carDto.getSeatCount(), is(2));
    }
}

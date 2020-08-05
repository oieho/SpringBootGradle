package com.test.www.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
@Getter
@RequiredArgsConstructor
public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);
        //when
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

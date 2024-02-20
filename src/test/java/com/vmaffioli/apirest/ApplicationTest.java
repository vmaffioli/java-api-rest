package com.vmaffioli.apirest;

import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import com.vmaffioli.apirest.Application;

@SpringBootTest
class ApplicationTest {

    @Test
    void main() {
        String[] args = new String[] { "foo", "bar" };

        try (MockedStatic<SpringApplication> mocked = mockStatic(SpringApplication.class)) {

            mocked.when(() -> {
                SpringApplication.run(Application.class, new String[] { "foo", "bar" });
            }).thenReturn(Mockito.mock(ConfigurableApplicationContext.class));

            Application.main(args);

            mocked.verify(() -> {
                SpringApplication.run(Application.class);
            });

        }
    }
}

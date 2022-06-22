package br.com.example.dummymaven;

import br.com.example.dummymaven.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HomeControllerTests {
	@Test
	void deveObterOk() {

		// arrange
		HomeController sut = new HomeController();

		// act
		String actual = sut.index();

		// assert
		assertEquals("ok", actual);
	}
}

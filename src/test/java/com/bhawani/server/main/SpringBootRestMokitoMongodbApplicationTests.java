package com.bhawani.server.main;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.lenient;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.ReflectionTestUtils;

import com.bhawani.repository.DataService;
import com.bhawani.service.impl.SomeBusinessImpl;
import com.bhawani.service.impl.StudentRegisterServiceImpl;
import com.bhawani.utils.MyConfigProperties;
import com.bhawani.utils.PropertyValues;
import com.bhawani.utils.ServiceProperties;

//@RunWith(SpringRunner.class)
//@SpringBootTest

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = DemoApplication.class)
//@SpringBootTest
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = TestHelper.class, initializers = ConfigFileApplicationContextInitializer.class)
@TestPropertySource
public class SpringBootRestMokitoMongodbApplicationTests {

	@Mock
	private DataService dataServiceMock;

	@Mock
	private PropertyValues propertyValues;

	@Mock
	private ServiceProperties serviceProperties;

	// @Spy
	@InjectMocks
	private SomeBusinessImpl businessImpl;

	// @Spy
	@InjectMocks
	private StudentRegisterServiceImpl studentRegisterServiceImpl;

	@Autowired
	private MyConfigProperties configProperties;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		// businessImpl.setDataService(dataServiceMock);
		// businessImpl.setPropertyValues(propertyValues);
		// businessImpl.setServiceProperties(serviceProperties);
		// studentRegisterServiceImpl.setServiceProperties(serviceProperties);
		serviceProperties.setLocale(new Locale("EN"));
		ReflectionTestUtils.setField(studentRegisterServiceImpl, "url", "http://google.com");
		ReflectionTestUtils.setField(businessImpl, "url", "http://gmail.com");
	}

	@Test
	public void testFindTheGreatestFromAllData() {
		System.out.println(
				"\n\n************** SpringBootRestMokitoMongodbApplicationTests.testFindTheGreatestFromAllData()\n\n");
		lenient().when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testPropertiesNotNull() {
		//Assert.assertEquals("someKey", configProperties.getSomeProperty());
	}

	@Test
	public void givenDefaultTPS_whenVariableRetrieved_thenDefaultFileReturned() {
		/*
		 * String output = configProperties.getSomeProperty();
		 * System.out.println("%%%%%%%%%%%%   output : " + output);
		 * Assert.assertEquals(output,"someKey");
		 */
	}
}

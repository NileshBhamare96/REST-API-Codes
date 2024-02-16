package in.nileshit.test;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@MockBean
	private WelcomeService service;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void welcomeMsgTest() throws Exception {

		// defining mock obj behaviour
		when(service.getMsg()).thenReturn("Welcome to Ashok IT");

		// preparing request
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");

		// sending request
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();

		// get the response
		MockHttpServletResponse response = mvcResult.getResponse();

		// validate response status code
		int status = response.getStatus();
		assertEquals(200, status);

	}

}

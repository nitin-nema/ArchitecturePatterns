// UserService.java
@Service
public class UserService {
    public String getUserRole(String username) {
        return username.equals("admin") ? "ADMIN" : "USER";
    }
}

// UserServiceIntegrationTest.java
@SpringBootTest
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserRole_Admin() {
        String role = userService.getUserRole("admin");
        assertEquals("ADMIN", role);
    }

    @Test
    public void testGetUserRole_NormalUser() {
        String role = userService.getUserRole("john");
        assertEquals("USER", role);
    }
}

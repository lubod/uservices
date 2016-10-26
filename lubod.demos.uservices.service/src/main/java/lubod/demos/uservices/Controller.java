package lubod.demos.uservices;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Repository bookRepository;

    @RequestMapping("/rec")
    public String getRecommendation() throws UnknownHostException {
        return "the host in IP: "
                + InetAddress.getLocalHost().getHostAddress()
                + " recommends this book: "
                + bookRepository.getRandomOrder().get(0);
    }
}

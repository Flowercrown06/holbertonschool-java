
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String welcomeMessage() {
        return "Welcome to the REST API for generating numbers for the Mega Sena lottery.";
    }

    @GetMapping("/getNumbers")
    public List<Integer> megaSenaNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < 6) {
            int num = random.nextInt(60) + 1; // 1 to 60
            numbers.add(num);
        }

        List<Integer> result = new ArrayList<>(numbers);
        Collections.sort(result); // ascending order
        return result;
    }
}
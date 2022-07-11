@Getter
@Configuration
public class AwsConfiguration {

    @Value(value = "${aws.region}")
    private String region;

    @Value(value = "${aws.access-key}")
    public String accessKey ;

    @Value(value = "${aws.secret-key}")
    private String secretKey;


}
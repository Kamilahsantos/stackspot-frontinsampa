@Configuration
public class SqsConfiguration {

    private final AwsConfiguration awsConfiguration;

    public SqsConfiguration(AwsConfiguration awsConfiguration) {
        this.awsConfiguration = awsConfiguration;
    }


    @Bean
    public SqsAsyncClient sqsAsyncClient() {
        return SqsAsyncClient.builder()
                .region(Region.of(awsConfiguration.getRegion()))
                .endpointOverride(URI.create("http://localhost:4566"))
                .credentialsProvider(this.awsCredentialsProvider())
                .build();
    }


    private AwsCredentialsProvider awsCredentialsProvider() {
        return StaticCredentialsProvider.create(AwsBasicCredentials
                .create(awsConfiguration.getAccessKey(), awsConfiguration.getSecretKey()));


    }
}
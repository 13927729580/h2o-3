package water.persist;

import water.api.AbstractRegister;
import water.api.AlgoAbstractRegister;
import water.api.RestApiContext;

public class RegisterRestApi extends AbstractRegister {
    @Override
    public void registerEndPoints(RestApiContext context) {
        context.registerEndpoint("set_s3_credentials", "POST /3/PersistS3", PersistS3Handler.class, "setS3Credentials", "Set Amazon S3 credentials (Secret Key ID, Secret Access Key)");
    }

    @Override
    public String getName() {
        return "Amazon S3";
    }
}

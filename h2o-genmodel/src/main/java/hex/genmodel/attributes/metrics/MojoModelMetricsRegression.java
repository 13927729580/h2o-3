package hex.genmodel.attributes.metrics;

public class MojoModelMetricsRegression extends MojoModelMetricsSupervised {
  public double _mean_residual_deviance;
  @SerializedName("rmsle")
  public double _root_mean_squared_log_error;
}

extensions = dict(
    set_required_params="""
parms$training_frame <- training_frame
args <- .verify_dataxy(training_frame, x, y)
parms$ignored_columns <- args$x_ignore
parms$response_column <- args$y
"""
)

doc = dict(
    preamble="""
Trains a Support Vector Machine model on an H2O dataset

Alpha version. Supports only binomial classification problems. 
""",
    params=dict(
        y="""
The name or column index of the response variable in the data. The response must be either a binary
categorical/factor variable or a numeric variable with values -1/1 (for compatibility with SVMlight format).
"""
    ),
)

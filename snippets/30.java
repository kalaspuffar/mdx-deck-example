  ...
  gradient_clipping_by_norm: 10.0
  fine_tune_checkpoint: "[OUTPUT_PATH]/model.ckpt"
  from_detection_checkpoint: false
  num_steps: 200000
  data_augmentation_options {
    random_horizontal_flip {
    }
  }
}
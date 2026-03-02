using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ExperimentFeedbackForm
    {
        public string? ExperimentKey { get; set; }
        public string? FeedbackType { get; set; }
        public string? FeedbackContent { get; set; }
        public int? Rating { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchAssignmentForm
    {
        public List<string>? ExperimentKeys { get; set; }
        public Dictionary<string, object>? UserAttributes { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchFeatureCheckForm
    {
        public List<string>? FeatureKeys { get; set; }
        public object? UserAttributes { get; set; }
    }
}

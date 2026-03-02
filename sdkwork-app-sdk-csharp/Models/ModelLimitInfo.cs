using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ModelLimitInfo
    {
        public string? Unit { get; set; }
        public List<ModelLimitItem>? Items { get; set; }
    }
}

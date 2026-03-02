using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ActivityReward
    {
        public string? Type { get; set; }
        public string? Name { get; set; }
        public int? Quantity { get; set; }
        public string? Icon { get; set; }
    }
}

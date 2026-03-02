using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UsageTimeDistributionVO
    {
        public int? Midnight { get; set; }
        public int? Morning { get; set; }
        public int? Afternoon { get; set; }
        public int? Evening { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipUpgradeVO
    {
        public string? Price { get; set; }
        public string? TargetLevel { get; set; }
        public string? UpgradeUrl { get; set; }
        public string? Discount { get; set; }
    }
}

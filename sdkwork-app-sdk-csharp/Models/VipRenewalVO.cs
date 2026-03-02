using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipRenewalVO
    {
        public string? Price { get; set; }
        public string? Period { get; set; }
        public string? RenewalUrl { get; set; }
        public bool? AutoRenew { get; set; }
    }
}

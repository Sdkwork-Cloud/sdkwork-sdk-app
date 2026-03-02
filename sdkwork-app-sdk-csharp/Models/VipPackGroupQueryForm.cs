using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipPackGroupQueryForm
    {
        public int? VipLevelId { get; set; }
        public bool? RecommendedOnly { get; set; }
    }
}

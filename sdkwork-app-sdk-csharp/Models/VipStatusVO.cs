using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VipStatusVO
    {
        public bool? IsVip { get; set; }
        public int? VipLevel { get; set; }
        public string? ExpireTime { get; set; }
        public int? PointBalance { get; set; }
    }
}

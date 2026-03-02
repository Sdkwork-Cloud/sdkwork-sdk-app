using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CustomerServiceInfo
    {
        public string? ServiceId { get; set; }
        public string? ServiceName { get; set; }
        public string? ServicePhone { get; set; }
        public string? ServiceWechat { get; set; }
        public bool? Online { get; set; }
    }
}

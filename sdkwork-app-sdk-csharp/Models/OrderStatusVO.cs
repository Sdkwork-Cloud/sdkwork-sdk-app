using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderStatusVO
    {
        public string? OrderId { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public int? ExpireTime { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderCancelForm
    {
        public string? OrderId { get; set; }
        public string? CancelReason { get; set; }
        public string? Reason { get; set; }
        public string? CancelType { get; set; }
    }
}

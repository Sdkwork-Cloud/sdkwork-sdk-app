using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RefundApplyForm
    {
        public string? OrderId { get; set; }
        public string? RefundAmount { get; set; }
        public string? RefundReason { get; set; }
        public string? Reason { get; set; }
        public string? RefundType { get; set; }
        public string? ProofImage { get; set; }
    }
}

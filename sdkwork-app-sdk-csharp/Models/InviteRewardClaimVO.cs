using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InviteRewardClaimVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? Amount { get; set; }
        public string? Balance { get; set; }
        public string? TransactionId { get; set; }
    }
}

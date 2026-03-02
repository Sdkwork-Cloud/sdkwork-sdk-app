using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AccountDeactivateForm
    {
        public string? Reason { get; set; }
        public string? VerifyCode { get; set; }
        public string? Password { get; set; }
        public bool? Confirm { get; set; }
        public string? Remark { get; set; }
    }
}

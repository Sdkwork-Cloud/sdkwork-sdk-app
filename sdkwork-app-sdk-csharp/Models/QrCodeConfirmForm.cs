using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class QrCodeConfirmForm
    {
        public string? QrKey { get; set; }
        public string? Token { get; set; }
    }
}

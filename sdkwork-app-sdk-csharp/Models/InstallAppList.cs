using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class InstallAppList
    {
        public List<int>? AppIdList { get; set; }
    }
}
